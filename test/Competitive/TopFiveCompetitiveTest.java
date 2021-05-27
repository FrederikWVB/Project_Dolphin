package Competitive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopFiveCompetitiveTest {

    @Test
    void disciplineList() {

        //Arrange
        TopFiveCompetitive T1 = new TopFiveCompetitive();
        String b = "butterfly";
        String back= "backstroke";


        //act
        TopFiveCompetitive.disciplineList(b);
        TopFiveCompetitive.disciplineList(back);

        //assert
        assertEquals("butterfly",b);
        assertEquals("backstroke",back);
    }


}