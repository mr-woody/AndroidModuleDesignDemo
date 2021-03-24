package com.woodys.module2.config

/**
 *
 * @author yuetao
 *
 */
class ModuleConfig {

    object Module2{
        const val SCHEME = "router"
        const val HOST = "$SCHEME://scheme.woodys.module2/"
        const val PACKAGE = "com.woodys.module2"

        //activity
        const val URL_MODULE_MAIN_ACTIVITY = HOST + "module2/page/main"

    }
}