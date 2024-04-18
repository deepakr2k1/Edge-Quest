package com.example.cpEdgeCaseFinder.exceptions;

import com.example.cpEdgeCaseFinder.constants.AppConstants.Filetype;
import com.example.cpEdgeCaseFinder.utils.Utils;
import lombok.Data;

@Data
public class CompilationException extends Exception {

    private Filetype filetype;
    private String filename;

    public CompilationException(String message, String filename, Filetype filetype) {
        super(message);
        this.filetype = filetype;
        this.filename = filename;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return message.replaceAll(filename, Utils.getFiletypeString(filetype));
    }
}
