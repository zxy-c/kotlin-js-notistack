package com.zxy.notistack

import kotlinext.js.jsObject

fun SnackbarManager.enqueueSnackbar(
    message: String,
    variant: SnackbarVariant? = null,
    verticalAlign: SnackbarVerticalAlign? = null,
    horizontalAlign: SnackbarHorizontalAlign? = null
) {
    this.enqueueSnackbar(message, jsObject {
        variant?.let {
            this.variant = variant.name
        }
        if (verticalAlign != null || horizontalAlign != null) {
            this.anchorOrigin = jsObject {
                verticalAlign?.let {
                    this.vertical = verticalAlign.name
                }
                horizontalAlign?.let {
                    this.horizontal = horizontalAlign.name
                }
            }
        }
    })
}

@Suppress("EnumEntryName")
enum class SnackbarVariant {
    succcess,
    error,
    default,
    warning,
    info
}

@Suppress("EnumEntryName")
enum class SnackbarVerticalAlign {
    top,
    bottom
}

@Suppress("EnumEntryName")
enum class SnackbarHorizontalAlign {
    left,
    center,
    right
}
