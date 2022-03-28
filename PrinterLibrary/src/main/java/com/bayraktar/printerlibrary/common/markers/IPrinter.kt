package com.bayraktar.printerlibrary.common.markers

import com.bayraktar.printerlibrary.common.PrinterConnection

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
interface IPrinter {
    val isConnected: Boolean
    suspend fun print(byteArray: ByteArray): Int
    suspend fun connect(connection: PrinterConnection)
    fun disconnect()
}