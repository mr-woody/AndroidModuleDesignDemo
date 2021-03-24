package com.woodys.module2.demo.design

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.woodys.router.Router
import com.woodys.router.callback.RouteCallback
import com.woodys.router.configs.RouterConfiguration
import com.woodys.router.exception.NotFoundException
import com.woodys.router.module.RouteRule
import com.woodys.module2.demo.R
import com.woodys.module2.demo.config.ModuleConfig
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RouterConfiguration.get().callback = object:RouteCallback{
            override fun notFound(uri: Uri?, e: NotFoundException?) {
                Toast.makeText(applicationContext,e?.message,Toast.LENGTH_LONG).show()
                Toast.makeText(applicationContext,e?.message+"开发完成后，提交pull request（PR）请求合并到dev_feature_branch，开发完成后，提交pull request（PR）请求合并到dev_feature_branch，开发完成后，提交pull request（PR）请求合并到dev_feature_branch，开发完成后，提交pull request（PR）请求合并到dev_feature_branch，开发完成后，提交pull request（PR）请求合并到dev_feature_branch开发完成后，提交pull request（PR）请求合并到dev_feature_branch",Toast.LENGTH_LONG).show()

            }

            override fun onOpenSuccess(uri: Uri?, rule: RouteRule<out RouteRule<*, *>, *>?) {}

            override fun onOpenFailed(uri: Uri?, e: Throwable?) {}

        }

        btn1.setOnClickListener {
            Router.create(ModuleConfig.Module1.URL_MODULE_MAIN_ACTIVITY)
                .open(this)
        }

        btn2.setOnClickListener {
            Router.create(ModuleConfig.Module2.URL_MODULE_MAIN_ACTIVITY)
                .open(this)
        }

    }
}
