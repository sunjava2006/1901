//index.js
//获取应用实例
const app = getApp()

Page({
    data: {
        currId: 0
    },
    selectItem: function(e) {
        var curId = e.target.id;
        
        this.setData({currId: curId});
    },
    onLoad: function() {

    }

})