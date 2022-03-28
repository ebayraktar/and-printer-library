package com.bayraktar.printerlibrary.printers

import com.bayraktar.printerlibrary.common.Printer
import com.bayraktar.printerlibrary.common.PrinterConnection

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
internal class NetworkPrinter : Printer() {
    override var isConnected: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}

    override suspend fun print(byteArray: ByteArray): Int {
        TODO("Not yet implemented")
    }

    override suspend fun connect(connection: PrinterConnection) {
        TODO("Not yet implemented")
    }

    override fun disconnect() {
        TODO("Not yet implemented")
    }
}