package picard.cmdline.programgroups;

import picard.cmdline.CommandLineProgramGroup;
/**
 * @author nhomer
 */
public class Fingerprinting implements CommandLineProgramGroup {
    @Override
    public String getName() { return "Fingerprinting Tools"; }
    @Override
    public String getDescription() { return "Tools for manipulating fingerprints, or related data."; }
}
