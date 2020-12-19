package com.example.wsy8.bean;

import com.example.wsy8.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "款式1", "款式2", "款式3", "款式4", "款式5", "款式6","款式7","款式8"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "款式1 ：超高性能",
            "款式2 ：超高性能",
            "款式3 ：超高性能",
            "款式4 ：超高性能",
            "款式5 ：超高性能",
            "款式6：超高性能",
            "款式7：超高性能",
            "款式8：超高性能"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {4129,5999, 4289, 5499, 6899, 7599,4621,4199};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.n1, R.drawable.n2, R.drawable.n3,
            R.drawable.n4, R.drawable.n5, R.drawable.n6,R.drawable.n7,R.drawable.n8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.n1, R.drawable.n2, R.drawable.n3,
            R.drawable.n4, R.drawable.n5, R.drawable.n6,R.drawable.n7,R.drawable.n8
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
