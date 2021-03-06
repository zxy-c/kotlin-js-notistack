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

@JsName("useSnackbar")
external fun useSnackbarRaw(): UseSnackbarObject

external interface UseSnackbarObject {
    val enqueueSnackbar: EnqueueSnackbar
}

