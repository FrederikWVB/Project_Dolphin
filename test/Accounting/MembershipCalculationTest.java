package Accounting;

import Member.Member;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MembershipCalculationTest {

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