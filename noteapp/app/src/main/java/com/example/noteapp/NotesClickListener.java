package com.example.noteapp;
import androidx.cardview.widget.CardView;

import com.example.noteapp.Models.notes;

public interface NotesClickListener {
    void onClick(notes notes);
    void onLongClick(notes notes, CardView cardView);

}