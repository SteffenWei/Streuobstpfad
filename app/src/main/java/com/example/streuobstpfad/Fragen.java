package com.example.streuobstpfad;

public class Fragen {

    public String mFragen[] = {
            "Which is the first planet in the Solar system",
            "Which is the second planet in the Solar system",
            "Which is the third planet in the Solar system",
            "Which is the fourth planet in the Solar system",
            "Which is the fifth planet in the Solar system",
            "Which is the sixth planet in the Solar system",
            "Which is the seventh planet in the Solar system",
            "Which is the eighth planet in the Solar system",
            "Which is the ninth planet in the Solar system"
    };

    private String mAntworten[][] = {
            {"Merkur", "Venus", "Mars", "Saturn"},
            {"Jupiter", "Venus", "Erde", "Neptun"},
            {"Erde", "Jupiter", "Pluto", "Venus"},
            {"Jupiter", "Saturn", "Mars", "Erde"},
            {"Jupiter", "Pluto", "Merkur", "Erde"},
            {"UrAnus", "Venus", "Mars", "Saturn"},
            {"Saturn", "Pluto", "UrAnus", "Erde"},
            {"Venus", "Neptun", "Pluto", "Mars"},
            {"Merkur", "Venus", "Mars", "Pluto"},
    };

    private String mRichtigeAntworten[] = {"Merkur","Venus","Erde","Mars","Jupiter","Saturn","UrAnus","Neptun","Pluto"};

    public String getFrage(int a){
        String tfrage = mFragen[a];
        return tfrage;
    }

    public String getAntworten1(int a) {

        String tant = mAntworten[a][0];
        return tant;
    }

    public String getAntworten2(int a) {

        String tant = mAntworten[a][1];
        return tant;
    }
    public String getAntworten3(int a) {

        String tant = mAntworten[a][2];
        return tant;
    }
    public String getAntworten4(int a) {

        String tant = mAntworten[a][3];
        return tant;
    }

    public String getRichtigeAntwort(int a){
        String trant = mRichtigeAntworten[a];
        return trant;

    }

}
