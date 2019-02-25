package com.anmnight.remoteprocess.pojo;

import java.util.List;

public class RoomInfo {

    /**
     * RoomInfo : {"RoomNo":"103","RoomTypeCode":"M085","RoomTypeName":"双人标准间","IsValid":true,"Remark":"舒适的双人间，带独立卫浴间，24小时热水。","RoomStatusCode":"VC"}
     * StatusList : [{"id":"102-2017-08-26","date":"2017-08-26","roomNo":"102","orderDetailId":"","orderId":"","guestName":"","roomStatus":"V","guestMobile":"","roomType":"","isDirty":false,"isHourRent":false,"makeCollections":0,"sourceChannel":"","roomRate":0,"days":1,"remark":""}]
     */

    private RoomInfoBean RoomInfo;
    private List<SimpleOrder> StatusList;

    public RoomInfoBean getRoomInfo() {
        return RoomInfo;
    }

    public void setRoomInfo(RoomInfoBean RoomInfo) {
        this.RoomInfo = RoomInfo;
    }

    public List<SimpleOrder> getStatusList() {
        return StatusList;
    }

    public void setStatusList(List<SimpleOrder> StatusList) {
        this.StatusList = StatusList;
    }

    public static class RoomInfoBean {
        /**
         * RoomNo : 103
         * RoomTypeCode : M085
         * RoomTypeName : 双人标准间
         * IsValid : true
         * Remark : 舒适的双人间，带独立卫浴间，24小时热水。
         * RoomStatusCode : VC
         */

        private String RoomNo;
        private String RoomTypeCode;
        private String RoomTypeName;
        private boolean IsValid;
        private String Remark;
        private String RoomStatusCode;

        public String getRoomNo() {
            return RoomNo;
        }

        public void setRoomNo(String RoomNo) {
            this.RoomNo = RoomNo;
        }

        public String getRoomTypeCode() {
            return RoomTypeCode;
        }

        public void setRoomTypeCode(String RoomTypeCode) {
            this.RoomTypeCode = RoomTypeCode;
        }

        public String getRoomTypeName() {
            return RoomTypeName;
        }

        public void setRoomTypeName(String RoomTypeName) {
            this.RoomTypeName = RoomTypeName;
        }

        public boolean isIsValid() {
            return IsValid;
        }

        public void setIsValid(boolean IsValid) {
            this.IsValid = IsValid;
        }

        public String getRemark() {
            return Remark;
        }

        public void setRemark(String Remark) {
            this.Remark = Remark;
        }

        public String getRoomStatusCode() {
            return RoomStatusCode;
        }

        public void setRoomStatusCode(String RoomStatusCode) {
            this.RoomStatusCode = RoomStatusCode;
        }
    }

    public static class SimpleOrder{
        /**
         * id : 102-2017-08-26
         * date : 2017-08-26
         * roomNo : 102
         * orderDetailId :
         * orderId :
         * guestName :
         * roomStatus : V
         * guestMobile :
         * roomType :
         * isDirty : false
         * isHourRent : false
         * makeCollections : 0.0
         * sourceChannel :
         * roomRate : 0.0
         * days : 1
         * remark :
         */

        private String id;
        private String date;
        private String roomNo;
        private String orderDetailId;
        private String orderId;
        private String guestName;
        private String roomStatus;
        private String guestMobile;
        private String roomType;
        private boolean isDirty;
        private boolean isHourRent;
        private double makeCollections;
        private String sourceChannel;
        private double roomRate;
        private int days;
        private String remark;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getRoomNo() {
            return roomNo;
        }

        public void setRoomNo(String roomNo) {
            this.roomNo = roomNo;
        }

        public String getOrderDetailId() {
            return orderDetailId;
        }

        public void setOrderDetailId(String orderDetailId) {
            this.orderDetailId = orderDetailId;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getGuestName() {
            return guestName;
        }

        public void setGuestName(String guestName) {
            this.guestName = guestName;
        }

        public String getRoomStatus() {
            return roomStatus;
        }

        public void setRoomStatus(String roomStatus) {
            this.roomStatus = roomStatus;
        }

        public String getGuestMobile() {
            return guestMobile;
        }

        public void setGuestMobile(String guestMobile) {
            this.guestMobile = guestMobile;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public boolean isIsDirty() {
            return isDirty;
        }

        public void setIsDirty(boolean isDirty) {
            this.isDirty = isDirty;
        }

        public boolean isIsHourRent() {
            return isHourRent;
        }

        public void setIsHourRent(boolean isHourRent) {
            this.isHourRent = isHourRent;
        }

        public double getMakeCollections() {
            return makeCollections;
        }

        public void setMakeCollections(double makeCollections) {
            this.makeCollections = makeCollections;
        }

        public String getSourceChannel() {
            return sourceChannel;
        }

        public void setSourceChannel(String sourceChannel) {
            this.sourceChannel = sourceChannel;
        }

        public double getRoomRate() {
            return roomRate;
        }

        public void setRoomRate(double roomRate) {
            this.roomRate = roomRate;
        }

        public int getDays() {
            return days;
        }

        public void setDays(int days) {
            this.days = days;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

}