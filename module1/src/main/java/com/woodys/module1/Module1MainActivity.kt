package com.woodys.module1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.woodys.module1.R
import com.woodys.router.annotation.Route
import com.woodys.commonbusiness.json.GsonUtils
import com.woodys.module1.config.ModuleConfig
import com.woodys.module1.model.JavaBeanEntry
import com.woodys.module1.model.ReportJsonData
import com.woodys.module1.model.WrongJsonData
import com.woodys.module1.model.classrom.InclassRoomDto

@Route(value =  [ModuleConfig.Module1.URL_MODULE_MAIN_ACTIVITY])
class Module1MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module1_main)


        val json1 ="{\"msg\":\"{\\\"keyId\\\":\\\"8399\\\",\\\"msgId\\\":\\\"6eb3b52c-213a-4da2-88cf-5bb0be7639fb\\\",\\\"msgType\\\":\\\"AUDIO\\\",\\\"payload\\\":\\\"{\\\\\\\"url\\\\\\\":\\\\\\\"https://ap.okjiaoyu.cn/ap_1elrU3j5uP6.m4a\\\\\\\",\\\\\\\"duration\\\\\\\":4.0}\\\",\\\"scene\\\":\\\"deep_learning\\\",\\\"timestamp\\\":1576734184913,\\\"version\\\":1}\",\"msgDate\":1576734184486,\"isread\":0}"
        val javaBeanEntry1 = GsonUtils.fromJson(json1, JavaBeanEntry::class.java)
        println("javaBeanEntry1=" + GsonUtils.toJson(javaBeanEntry1))

        val json2 ="{\"msg\":{\"keyId\":\"8399\",\"msgId\":\"95fc67b3-570e-448d-813f-e98d34dea690\",\"msgType\":\"AUDIO\",\"payload\":{\"url\":\"https://ap.okjiaoyu.cn/ap_1erVuslMZEc.m4a\",\"duration\":4},\"scene\":\"deep_learning\",\"timestamp\":1577071367131,\"version\":1},\"msgDate\":\"1576734184486\"}"
        val javaBeanEntry2 = GsonUtils.fromJson(json2, JavaBeanEntry::class.java)
        println("javaBeanEntry2=" + GsonUtils.toJson(javaBeanEntry2))

        val json3 = "{\"msg\":true,\"msgDate\":\"\",\"duration\":[\"deep\",\"learning\"]}"
        val javaBeanEntry3 = GsonUtils.fromJson(json3, JavaBeanEntry::class.java)
        println("javaBeanEntry3=" + GsonUtils.toJson(javaBeanEntry3))

        val json4 = "{\"msg\":1,\"msgDate\":null,\"duration\":false}"
        val javaBeanEntry4 = GsonUtils.fromJson(json4, JavaBeanEntry::class.java)
        println("javaBeanEntry4=" + GsonUtils.toJson(javaBeanEntry4))

        val json5 = "{\"msg\":null,\"duration\":\"??????\"}"
        val javaBeanEntry5 = GsonUtils.fromJson(json5, JavaBeanEntry::class.java)
        println("javaBeanEntry5=" + GsonUtils.toJson(javaBeanEntry5))

        val json6 = "{\"msg\":\"dadada  \n\r   %$<><>>>>~`+231414   \",\"duration\":\"null\"}"
        val javaBeanEntry6 = GsonUtils.fromJson(json6, JavaBeanEntry::class.java)
        println("javaBeanEntry6=" + GsonUtils.toJson(javaBeanEntry6))


        val json7 = createJsonString(1203,"??????????????????")
        println("javaBeanEntry7=" + json7)


        val json8 = "{\"url\":\"https://github.com/xyxyLiu/AndResM\",\"duration\":\"??????\"}"
        val jsonObject8 = GsonUtils.fromJson(json8, JsonObject::class.java)
        val url8 = GsonUtils.getString("url", jsonObject8)
        println("javaBeanEntry8=" + url8)



        val json9 = "{\"url\":{\"name\":\"??????2\"},\"duration\":\"??????\"}"
        val jsonObject9 = GsonUtils.fromJson(json9, JsonObject::class.java)
        val url9 = GsonUtils.getString("url", jsonObject9)
        println("javaBeanEntry9=" + url9)


        val json10 = "{\"url\":[\"name1\",\"name2\",\"name3\"],\"duration\":\"??????\"}"
        val jsonObject10 = GsonUtils.fromJson(json10, JsonObject::class.java)
        val url10 = GsonUtils.getString("url", jsonObject10)
        println("javaBeanEntry10=" + url10)


        val json:String? = null
        Gson().fromJson(json, JavaBeanEntry::class.java)


        val json11 = "{\"list\":[{\"sid\":19,\"name\":\"??????\",\"surl\":\"http://hd.okjiaoyu.cn/hd_PPlwL7ycV2.png\",\"wrong\":312},{\"sid\":20,\"name\":\"??????\",\"surl\":\"http://hd.okjiaoyu.cn/hd_PPlxKgGKaI.png\",\"wrong\":167},{\"sid\":21,\"name\":\"??????\",\"surl\":\"http://hd.okjiaoyu.cn/hd_PPlyZTYOOI.png\",\"wrong\":117},{\"sid\":29,\"name\":\"??????\",\"surl\":\"http://hd.okjiaoyu.cn/hd_QceethAdwY.png\",\"wrong\":14}]}"
        GsonUtils.fromJsonToList(
            GsonUtils.getString("list",
                GsonUtils.fromJson(json11,JsonObject::class.java)),
            JavaBeanEntry::class.java)


        val temp = Gson().fromJson("{\"list\":[{\"showhelp\":false,\"kname\":\"???4??? ???????????????????????????\",\"degree\":\"0\",\"predegree\":\"0\",\"degreef\":\"0.0\",\"predegreef\":\"0.0\",\"degreepercent\":0,\"predegreepercent\":0,\"list\":[{\"type\":1,\"typename\":\"?????????\",\"recommend\":true,\"lock\":false,\"exercisenum\":null,\"teacherid\":null,\"aliaslist\":null},{\"type\":4,\"typename\":\"?????????\",\"recommend\":false,\"lock\":false,\"exercisenum\":null,\"teacherid\":null,\"aliaslist\":null},{\"type\":3,\"typename\":\"?????????\",\"recommend\":false,\"lock\":false,\"exercisenum\":null,\"teacherid\":null,\"aliaslist\":null},{\"type\":2,\"typename\":\"????????????\",\"recommend\":true,\"lock\":false,\"exercisenum\":null,\"teacherid\":null,\"aliaslist\":null},{\"type\":5,\"typename\":\"????????????\",\"recommend\":false,\"lock\":false,\"exercisenum\":null,\"teacherid\":null,\"aliaslist\":null}],\"kid\":\"11028\",\"ktype\":2,\"klevel\":2,\"kstate\":1,\"isOnDesk\":false,\"magicLearnTag\":0,\"mkid\":\"\",\"mkname\":\"\",\"mlearnstate\":null,\"rlist\":[]}]}", JsonObject::class.java)
        val list = GsonUtils.fromJsonToList(
            GsonUtils.getString("list",temp), ReportJsonData::class.java)
        if (list == null || list.isEmpty()) {}



        val json13 = "{\"uid\":\"461356\",\"uname\":\"82951428965\",\"name\":\"?????????????????????\",\"avatarurl\":\"http://hd.okjiaoyu.cn/hd_1emRULWpyNy.jpg\",\"gender\":2,\"grade\":\"?????????\",\"graduation\":0,\"location\":\"????????????????????? ????????? ?????????\",\"orglist\":[{\"sid\":\"54\",\"type\":0,\"name\":\"??????\",\"clist\":[]}],\"fontsize\":28,\"status\":2}"
        val jsonObject13 = GsonUtils.fromJsonToMap(json13,String::class.java)
        println("javaBeanEntry11=" + jsonObject13)

        val temp1 = Gson().fromJson("{\"list\":[{\"sid\":1,\"name\":\"??????\",\"surl\":\"http://hd.okjiaoyu.cn/hd_PPlwL7ycV2.png\",\"wrong\":5},{\"sid\":3,\"name\":\"??????\",\"surl\":\"http://hd.okjiaoyu.cn/hd_PPlxKgGKaI.png\",\"wrong\":11},{\"sid\":15,\"name\":\"??????\",\"surl\":\"http://hd.okjiaoyu.cn/hd_PPlt6rqQKI.png\",\"wrong\":6}]}", JsonObject::class.java)
        val dataList: List<WrongJsonData>? = GsonUtils.fromJsonToList(
            GsonUtils.getString("list",temp1), WrongJsonData::class.java)
        if (dataList != null && dataList?.size != 0) {
            println("javaBeanEntry12=" + dataList)
        }


        val json14 = "{\"success\":true,\"errorCode\":0,\"code\":0,\"msg\":\"????????????????????????\",\"content\":[{\"roomId\":2531623,\"createTime\":1578470935743,\"data\":{\"subjectname\":\"??????\",\"islive\":false,\"liveendtime\":0,\"coursename\":\"2020 0108 ??????\",\"livestarttime\":0,\"roomid\":\"2531623\",\"subjectid\":6,\"iconurls\":[\"https:\\/\\/hd.okjiaoyu.cn\\/hd_JlBZwLEn4Y.png    \"],\"classid\":13058,\"teacherid\":61951190098,\"classname\":\"??????-???????????????\",\"scolor\":\"#FFFF7043\",\"teachername\":\"???????????????\",\"publishtime\":1578470935397,\"courseid\":\"2531623\"}}]}"
        val javaBeanEntry14 = GsonUtils.fromJson(json14, InclassRoomDto::class.java)
        println("javaBeanEntry14=" + GsonUtils.toJson(javaBeanEntry14))
    }


    /**
     * ??????????????????response????????????????????????????????????????????????
     *
     * @param code ?????????
     * @param msg  ????????????
     * @return
     */
    private fun createJsonString(ecode: Int, emsg: String?): String {
        var meta = HashMap<String,Any?>()
        meta["ecode"] = ecode
        meta["emsg"] = emsg

        var json = HashMap<String,HashMap<String,Any?>>()
        json["meta"] = meta
        return GsonUtils.toJson(json)
    }
}