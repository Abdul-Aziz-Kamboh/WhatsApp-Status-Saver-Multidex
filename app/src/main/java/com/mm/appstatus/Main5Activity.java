package com.mm.appstatus;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
public class Main5Activity extends AppCompatActivity {
    Button chooseImg, uploadImg;
    ImageView imgView;
    int PICK_IMAGE_REQUEST = 111;
    Uri filePath;
    ProgressDialog pd;

    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference storageRef = storage.getReferenceFromUrl("gs://fir-example-c4312.appspot.com");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        chooseImg = (Button)findViewById(R.id.choos);
        uploadImg = (Button)findViewById(R.id.upload);
        imgView = (ImageView)findViewById(R.id.img);
    }
}
