package com.woodys.module1.config

/**
 *
 * @author yuetao
 *
 */
class ModuleConfig {

    object Module1{
        const val SCHEME = "router"
        const val HOST = "$SCHEME://scheme.woodys.module1/"
        const val PACKAGE = "com.woodys.module1"

        //activity
        const val URL_MODULE_MAIN_ACTIVITY = HOST + "module1/page/main"

    }
}