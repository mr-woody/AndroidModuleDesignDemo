package com.woodys.module2.demo.config

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

    object Module2{
        const val SCHEME = "router"
        const val HOST = "$SCHEME://scheme.woodys.module2/"
        const val PACKAGE = "com.woodys.module2"

        //activity
        const val URL_MODULE_MAIN_ACTIVITY = HOST + "module2/page/main"

    }
}