package com.bayraktar.printerlibrary.printers

import com.bayraktar.printerlibrary.common.Printer
import com.bayraktar.printerlibrary.common.PrinterConnection

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
internal class BluetoothPrinter : Printer() {
    override var isConnected: Boolean = false

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