package ie.bhaa.registration.service;

/**
 * Service to handle the synching and listing the membership json files.
 * Created by pauloconnell on 27/01/17.
 */
public interface MembershipFileService {

    String getMembershipFile();

    void reloadMembershipFile();

    void clearMembershipFile();

}
