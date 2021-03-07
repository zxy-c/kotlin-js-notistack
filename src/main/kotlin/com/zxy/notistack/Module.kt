@file:JsModule("notistack")
@file:JsNonModule

package com.zxy.notistack

import react.*

@Suppress("UnsafeCastFromDynamic")
@JsName("SnackbarProvider")
external val snackbarProvider: RClass<SnackbarProviderProps>

external interface SnackbarProviderProps : RProps {
    var maxSnack: Number
}

external fun useSnackbar(): SnackbarManager

external interface SnackbarManager {
    val enqueueSnackbar: (message: String, options: SnackbarOptions) -> Unit
}

external interface SnackbarOptions {
    var anchorOrigin: Origin?
    var variant: String
}

external interface Origin {
    var vertical: String
    var horizontal: String
}

