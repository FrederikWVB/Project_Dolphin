package Accounting;

import Member.Member;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MembershipCalculationTest {
    /*Guide til at lave unit test:
    1. først går du op i projektnavnet og højreklikker
    2. opret et nyt diretory
    3. Så højreklikker du på dit nye directory og vælger "mark Directory as" og vælge "Test sources root"
    4. Herefter går du ind på den klasse du vil teste og højreklikker på den, trykker generate og vælger test
     */

    @Test
    void calculateMembershipFee() {

        //Arrange
        MembershipCalculation calculation = new MembershipCalculation();
        Member member = new Member(1, "Andrea", 24, true, true);
        Member member2 = new Member(11, "Isabella", 10, true, true);


        //act
        double payment = MembershipCalculation.calculateMembershipFee(member);
        double payment2 = MembershipCalculation.calculateMembershipFee(member2);


        //Assert
        assertEquals(1600, payment);
        assertEquals(1000, payment2);

    }
}