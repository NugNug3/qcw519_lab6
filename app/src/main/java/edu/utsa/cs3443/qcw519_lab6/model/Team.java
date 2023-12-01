package edu.utsa.cs3443.qcw519_lab6.model;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    ArrayList<Avenger> team = new ArrayList<>();
    public void loadAvengers(Context context) {
        AssetManager asset = context.getAssets();

        try {
            InputStream is = asset.open("avengerData.csv");
            Scanner scan = new Scanner(is);
            String line = "";
            String[] token;

            while(scan.hasNextLine()) {
                line = scan.nextLine();
                token = line.split(",");
                team.add(new Avenger(token[0], token[1], token[3], token[4], token[5], token[6], Integer.parseInt(token[7]), Integer.parseInt(token[8])));
            }

        } catch(IOException e) {
            System.out.println("Failed to load Avengers.");
        }
    }
}
