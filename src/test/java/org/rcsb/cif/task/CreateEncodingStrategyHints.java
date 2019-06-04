package org.rcsb.cif.task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.rcsb.cif.EncodingStrategyHint;

import java.util.ArrayList;
import java.util.List;

public class CreateEncodingStrategyHints {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        List<EncodingStrategyHint> hints1 = new ArrayList<>();
        hints1.add(new EncodingStrategyHint("_atom_site", "Cartn_x", "pack", 0));
        hints1.add(new EncodingStrategyHint("_atom_site", "Cartn_y", "delta", 1));
        hints1.add(new EncodingStrategyHint("_atom_site", "Cartn_z", "rle", 3));

        System.out.println(gson.toJson(hints1));

        List<EncodingStrategyHint> hints2 = new ArrayList<>();
        EncodingStrategyHint hint21 = new EncodingStrategyHint();
        hint21.setCategoryName("_atom_site");
        hint21.setColumnName("Cartn_x");
        hint21.setEncoding("rle");
        hints2.add(hint21);
        EncodingStrategyHint hint22 = new EncodingStrategyHint();
        hint22.setCategoryName("_atom_site");
        hint22.setColumnName("Cartn_y");
        hint22.setPrecision(1);
        hints2.add(hint22);
        EncodingStrategyHint hint23 = new EncodingStrategyHint();
        hint23.setCategoryName("_atom_site");
        hint23.setColumnName("Cartn_z");
        hint23.setEncoding("pack");
        hint23.setPrecision(2);
        hints2.add(hint23);

        System.out.println(gson.toJson(hints2));
    }
}
