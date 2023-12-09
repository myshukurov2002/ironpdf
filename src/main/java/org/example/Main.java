package org.example;

import com.ironsoftware.ironpdf.PdfDocument;
import com.ironsoftware.ironpdf.internal.proto.Image;

public class Main {
    public static void main(String[] args) {
        PdfDocument pdfDocument = PdfDocument.renderHtmlFileAsPdf("");
    }

//    private static Image addQrCodeToPdf(String url) {
//        try {
//            byte[] qrCodeBytes = net.glxn.qrgen.javase.QRCode.from(url).stream().toByteArray();
//            ImageData imageData = ImageDataFactory.create(qrCodeBytes);
//            Image qrCodeImage = new Image(imageData);
//            qrCodeImage.setAutoScale(true);
//            qrCodeImage.setWidth(48);
//            qrCodeImage.setHeight(48);
//
//            return qrCodeImage;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
}