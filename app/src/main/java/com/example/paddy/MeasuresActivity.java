package com.example.paddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MeasuresActivity extends AppCompatActivity {

    private static final HashMap<String, String[]> diseaseInfo = new HashMap<String, String[]>() {{
        put("blast", new String[]{
                "Fungus (Magnaporthe oryzae)",
                "Lesions on leaves, necks, and panicles, leading to the formation of characteristic blast-like structures.",
                "Significant yield losses; affects all growth stages.",
                "Use resistant varieties, apply fungicides at the early stage of the disease, adopt proper water and nutrient management practices."
        });
        put("hispa", new String[]{
                "Beetle (Dicladispa armigera)",
                "Characteristic shot-hole damage on leaves due to feeding.",
                "Defoliation and reduction in yield; more common in tropical regions.",
                "Introduce natural predators like spiders and parasitoid wasps, use insecticides if necessary, practice crop rotation."
        });
        put("tungro", new String[]{
                "Rice tungro bacilliform virus (RTBV) and Rice tungro spherical virus (RTSV) transmitted by green leafhoppers.",
                "Yellowing, stunting, and reduced tillering.",
                "Significant yield reduction; affects young plants.",
                "Plant resistant varieties, control green leafhoppers through insecticides, eliminate alternate hosts, and practice proper field sanitation."
        });
        put("white_stem_borer", new String[]{
                "Larvae of the yellow stem borer (Scirpophaga incertulas).",
                "Entry holes in the stem, dead hearts, and white, powdery excrement.",
                "Yield loss due to stem damage; affects young plants.",
                "Use resistant varieties, practice field sanitation, apply insecticides at the larval stage, use pheromone traps."
        });
        put("brown_spot", new String[]{
                "Fungus (Cochliobolus miyabeanus)",
                "Brown, elliptical lesions on leaves.",
                "Reduced photosynthesis, yield loss; more common in areas with high humidity.",
                "Plant resistant varieties, practice crop rotation, apply fungicides when necessary, maintain proper plant spacing for good air circulation."
        });
        put("leaf_roller", new String[]{
                "Larvae of various moth species.",
                "Rolled or folded leaves due to larval feeding.",
                "Reduction in photosynthesis and yield; affects young plants.",
                "Apply insecticides at the early larval stage, introduce natural predators like parasitoid wasps, practice crop rotation."
        });
        put("downy_mildew", new String[]{
                "Fungus (Peronosclerospora oryzae)",
                "White to grayish growth on the undersides of leaves.",
                "Reduced plant vigor, yield loss; favors high humidity conditions.",
                "Plant resistant varieties, practice crop rotation, use fungicides preventively, improve drainage to reduce humidity."
        });
        put("yellow_stem_borer", new String[]{
                "Larvae of the yellow stem borer (Scirpophaga incertulas).",
                "Entry holes in the stem, dead hearts, and yellowing of leaves.",
                "Similar to white stem borer; affects young plants.",
                "Use resistant varieties, apply insecticides at the larval stage, use pheromone traps, practice proper field sanitation."
        });
        put("bacterial_leaf_blight", new String[]{
                "Bacterium (Xanthomonas oryzae pv. oryzae)",
                "Water-soaked lesions on leaves that turn brown with age.",
                "Significant yield loss; more common in tropical and subtropical regions.",
                "Use resistant varieties, apply copper-based bactericides, practice proper water management to minimize leaf wetness, adopt crop rotation."
        });
        put("black_stem_borer", new String[]{
                "Larvae of the black stem borer (Xylotrechus quadripes).",
                "Entry holes in the stem, dead hearts, and black powdery excrement.",
                "Similar to white and yellow stem borers; affects young plants.",
                "Apply insecticides at the larval stage, use pheromone traps, practice proper field sanitation."
        });
        put("bacterial_leaf_streak", new String[]{
                "Bacterium (Xanthomonas oryzae pv. oryzicola)",
                "Long, narrow lesions on leaves.",
                "Reduced photosynthesis, yield loss; often occurs alongside bacterial leaf blight.",
                "Use resistant varieties, apply copper-based bactericides, practice proper water management, and crop rotation."
        });
        put("bacterial_panicle_blight", new String[]{
                "Bacterium (Burkholderia glumae)",
                "Dark brown to black lesions on panicles.",
                "Significant reduction in grain quality and yield; more common in warm and humid conditions.",
                "Plant resistant varieties, apply bactericides during panicle development, adopt proper water management practices, and practice crop rotation."
        });
        put("dead_heart",new String[]{
                "Symptom associated with various pests including stem borers.",
                "The central leaves of the rice plant turn yellow and wither, resembling a \"dead heart.\"",
                "Affects young plants and can lead to stunted growth and yield loss.",
                "Implement pest control measures specific to the pest causing dead heart symptoms, such as using resistant varieties, applying insecticides, and practicing field sanitation."
        });
        put("normal", new String[]{"", "", ""});
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measures);

        Intent intent = getIntent();
        String selectedDisease = intent.getStringExtra("selectedDisease");

        String[] info = diseaseInfo.get(selectedDisease);

        if (info != null) {
            // Display information in TextViews (assuming you have TextViews in your layout)
            TextView causeTextView = findViewById(R.id.causeTextView);
            causeTextView.setText("CAUSE:\n" + info[0]);

            TextView symptomsTextView = findViewById(R.id.symptomsTextView);
            symptomsTextView.setText("SYMPTOMS:\n" + info[1]);

            TextView impactTextView = findViewById(R.id.impactTextView);
            impactTextView.setText("IMPACT:\n" + info[2]);

            TextView measuresTextView = findViewById(R.id.measuresTextView);
            measuresTextView.setText("MEASURES:\n" + info[3]);
        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }
}