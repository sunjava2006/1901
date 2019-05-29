//index.js
//获取应用实例
const app = getApp()

Page({
    data: {
        currId: 0,
        count:3
    },
    selectItem: function(e) {
        var curId = e.target.id;
        
        this.setData({currId: curId});
    },
    changeItem:function(e){
        var id = e.detail.currentItemId;
        this.setData({currId:id});
    },
    onLoad: function() {

    }

})