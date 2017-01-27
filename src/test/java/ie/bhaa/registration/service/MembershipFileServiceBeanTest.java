package ie.bhaa.registration.service;

import ie.bhaa.registration.BhaaRegistrationApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pauloconnell on 27/01/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(value = "dev")
@SpringApplicationConfiguration(classes = BhaaRegistrationApplication.class)
public class MembershipFileServiceBeanTest {

    @Autowired
    private MembershipFileService membershipFileService;

    @Test
    public void testGetMembershipFile() throws Exception {
//        assertEquals("expected url","http://bhaaie",membershipFileService.getMembershipFile());
        membershipFileService.reloadMembershipFile();;
    }
}