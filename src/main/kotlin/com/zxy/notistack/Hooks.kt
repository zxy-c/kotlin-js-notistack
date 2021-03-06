package com.zxy.notistack

fun useSnackbar(): SnackbarHookObject {
    val useSnackbarRaw = useSnackbarRaw()
    return SnackbarHookObject(useSnackbarRaw.enqueueSnackbar)
}

typealias EnqueueSnackbar = (message: String, options: dynamic) -> Unit

data class SnackbarHookObject(
    val enqueueSnackbar: EnqueueSnackbar
)