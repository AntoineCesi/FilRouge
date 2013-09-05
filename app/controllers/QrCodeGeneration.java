package controllers;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.QRCode;
import play.mvc.Controller;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.EnumMap;
import java.util.Map;

/**
 * Date: 03/09/13
 */
public class QrCodeGeneration extends Controller {

    public static void qrCodeGeneration(String text) throws IOException, WriterException {
        int magnify = 1; //The resolution of the QRCode

        QRCodeWriter writer = new QRCodeWriter();
        BitMatrix matrix;

        // The QR should be multiplied up to fit, with extra padding if necessary
        int size = 180;
        matrix = writer.encode(text, BarcodeFormat.QR_CODE, size, size, null);

        //Make the BufferedImage that are to hold the QRCode
        BufferedImage im = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
        im.createGraphics();
        Graphics2D g = (Graphics2D) im.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, size, size);

        //paint the image using the ByteMatrik
        for (int h = 0; h < matrix.getHeight(); h++) {
            for (int w = 0; w < matrix.getWidth(); w++) {
                //Find the colour of the dot
                if (matrix.get(h, w) == false) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                //Paint the dot
                g.fillRect(h * magnify, w * magnify, magnify, magnify);
            }
        }
        File qrCodeImg = new File("testQRCodeWriter.png");
        ImageIO.write(im, "png", qrCodeImg);

       renderBinary(qrCodeImg);
    }

//    private static BitMatrix generateMatrix(String data, int size) throws WriterException {
//        BitMatrix bitMatrix = new QRCodeWriter().encode(data, BarcodeFormat.QR_CODE, size, size);
//        return bitMatrix;
//    }

}
