package LettersCount;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class LettersDTO {
	
	private int vowelsCountInLine;
	private int consonantsCountInLine;
	public String readedLine;
	public Timestamp timestamp;
	public String typeOfInput;
	
	public int getVowelsCountInLine() {
        return vowelsCountInLine;
    }
    public void setVowelsCountInLine(int vowelsCountInLine) {
        this.vowelsCountInLine = vowelsCountInLine;
    }
    
    
    public int getConsonantsCountInLine() {
        return consonantsCountInLine;
    }
    public void setConsonantsCountInLine(int consonantsCountInLine) {
        this.consonantsCountInLine = consonantsCountInLine;
    }
    
    
	public String getReadedLine() {
        return readedLine;
    }
    public void setReadedLine(String readedLine) {
        this.readedLine = readedLine;
    }
    
    
    public Timestamp getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    
    
    public String getTypeOfInput() {
        return typeOfInput;
    }
    public void setTypeOfInput(String typeOfInput) {
        this.typeOfInput = typeOfInput;
    }
    
    
    
}
