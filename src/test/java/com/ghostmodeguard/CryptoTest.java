package com.ghostmodeguard;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class CryptoTest {
    @Test
    public void testDecryption() {
        try {
            // Prepare
            String stringKey = "E6B47686D7C99A22382EF75E09FAA354";
            AESReader crypto = new AESReader(stringKey);
            ComputedHidingRisk expectedRisk = getComputedHidingRisk();
            String encryptedMsg = "ysj4Kkl4GfK2BuBS4vYy8PpiAt0eBtkihOe6fOtYmNUNUH7PSnxWAuqaIKGjfNamUtCJUH5ji5NkEx0ITlJbDlFGNpkxNIfo8DLvO2pEOWPJDRF9vnXO3X5TeG35";

            // Act
            ComputedHidingRisk actualRisk = crypto.decrypt(encryptedMsg);

            // Verify
            assertThat(actualRisk).usingRecursiveComparison().isEqualTo(expectedRisk);
        } catch (GhostModeGuardException e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    private static ComputedHidingRisk getComputedHidingRisk() {
        ComputedHidingRisk expectedRisk = new ComputedHidingRisk();
        expectedRisk.setToken("tok");
        expectedRisk.setVerdict(Verdict.OK);
        expectedRisk.setDenyScore(1);
        expectedRisk.setVirtualMachineScore(2);
        expectedRisk.setAntiTrackerScore(3);
        expectedRisk.setHideDeviceScore(4);
        expectedRisk.setPrivateNavigationScore(5);
        expectedRisk.setHideRealIPScore(6);
        expectedRisk.setBadReputationIPScore(7);
        expectedRisk.setRootScore(8);
        expectedRisk.setBotScore(9);
        return expectedRisk;
    }
}
