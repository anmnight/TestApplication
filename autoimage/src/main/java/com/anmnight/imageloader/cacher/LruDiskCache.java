package com.anmnight.imageloader.cacher;

import com.anmnight.imageloader.LoadTask;
import com.anmnight.imageloader.base.DiskCache;
import com.anmnight.imageloader.base.Downloader;
import com.anmnight.imageloader.utils.DiskLruCache;
import com.anmnight.imageloader.HexNameGenerate;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class LruDiskCache implements DiskCache {

    private HexNameGenerate nameGenerate;
    private final DiskLruCache cache;
    private String tag = "LruDiskCache";

    public LruDiskCache(File cacheDir) throws IOException {
        this.nameGenerate = new HexNameGenerate();
        this.cache = DiskLruCache.open(cacheDir, 1, 1, Integer.MAX_VALUE);
    }

    @Override
    public byte[] get(String key) {
        InputStream stream = null;
        try {
            DiskLruCache.Snapshot snapshot = cache.get(nameGenerate.generate(key));
            if (snapshot == null) {
                return null;
            }
            stream = snapshot.getInputStream(0);
            byte[] bytes = new byte[stream.available()];
            int b = stream.read(bytes);
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {


            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void put(byte[] bytes, String key) {
        synchronized (cache) {
            try {
                DiskLruCache.Editor editor = cache.edit(nameGenerate.generate(key));
                OutputStream os = new BufferedOutputStream(editor.newOutputStream(0));
                os.write(bytes, 0, bytes.length);
                editor.commit();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean remove(String key) {
        try {
            return cache.remove(nameGenerate.generate(key));
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public void close() {
        try {
            cache.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}