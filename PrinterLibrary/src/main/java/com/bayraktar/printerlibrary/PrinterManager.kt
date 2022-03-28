package com.bayraktar.printerlibrary

import com.bayraktar.printerlibrary.common.Printer
import com.bayraktar.printerlibrary.common.PrinterConnection
import com.bayraktar.printerlibrary.common.markers.IPrinter
import com.bayraktar.printerlibrary.printers.BluetoothPrinter
import com.bayraktar.printerlibrary.printers.NetworkPrinter
import com.bayraktar.printerlibrary.printers.UsbPrinter
import com.bayraktar.printerlibrary.utils.enums.PrinterConnectionType

/**
 * Created by Emre Bayraktar on 28.03.2022.
 */
class PrinterManager(printerType: PrinterConnectionType) : IPrinter {
    private val printer: Printer = when (printerType) {
        PrinterConnectionType.Bluetooth -> BluetoothPrinter()
        PrinterConnectionType.Network -> NetworkPrinter()
        PrinterConnectionType.Usb -> UsbPrinter()
    }

    /**
     * To be Added
     */
    override val isConnected: Boolean
        get() = printer.isConnected

    /**
     * To be Added
     */
    override suspend fun print(byteArray: ByteArray): Int {
        return printer.print(byteArray)
    }

    /**
     * To be Added
     */
    override suspend fun connect(connection: PrinterConnection) {
        printer.connect(connection)
    }

    /**
     * To be Added
     */
    override fun disconnect() {
        printer.disconnect()
    }
}