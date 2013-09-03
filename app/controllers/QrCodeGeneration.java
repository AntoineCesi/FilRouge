package controllers;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.encoder.QRCode;
import org.joda.time.DateTime;
import play.mvc.Controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Date: 03/09/13
 */
public class QrCodeGeneration extends Controller {

    public static void qrCodeGeneration() throws IOException, WriterException {

        String data = "Cool les Qr Code.";
        int size = 400;

        // encode
        BitMatrix bitMatrix = generateMatrix(data, size);
        String imageFormat = "png";
        String outputFileName = "c:/code/qrcode-01." + imageFormat;

        // write in a file
//        ByteArrayOutputStream byteArrayOutputStream =
//                new ByteArrayOutputStream();
//        MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, byteArrayOutputStream).;
//        byteArrayOutputStream.close();
//         QRCode.from(data)
//        renderBinary(MatrixToImageWriter.toBufferedImage(). , "test.pdf");
        render();
    }

    private static BitMatrix generateMatrix(String data, int size) throws WriterException {
        BitMatrix bitMatrix = new QRCodeWriter().encode(data, BarcodeFormat.QR_CODE, size, size);
        return bitMatrix;
    }

}
