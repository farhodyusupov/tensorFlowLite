package com.example.tensorflowlite.test.functions;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class TensorflowTraining{
   static final String MODEL_PATH = "src/main/assets/model/bottlenect.tflite";
   final String DATASET_PATH = "src/main/assets/data/";
   final int epoch = 5;
   final String TAG = "OnDeviceTraining";
   private static AssetManager assetManager;


   public static MappedByteBuffer loadModel() throws IOException {
      AssetFileDescriptor fileDescriptor = assetManager.openFd(MODEL_PATH);

      FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
      FileChannel fileChannel = inputStream.getChannel();
      long startOffset = fileDescriptor.getStartOffset();
      long declaredLength = fileDescriptor.getDeclaredLength();
      return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
   }
   public static void loadDataSet(){}
   public  static  void train(){}
   public static void evaluate(){}
    public static void convertImage(){}

}