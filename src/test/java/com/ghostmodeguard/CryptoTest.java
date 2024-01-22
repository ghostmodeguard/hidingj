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
            Crypto crypto = new Crypto(stringKey);
            ComputedHidingRisk expectedRisk = getComputedHidingRisk();
            String encryptedMsg = "mPR1YoJ1/TtSN9Mvq0az5yigrZtxPr8WSgho7Pj5bQv+aA7zyAaAScP/BdXZ6H4EbVr43mmYd74tIPedT9qR87RaYl1wSUnby3cdDtc=";

            // Act
            ComputedHidingRisk actualRisk = crypto.decrypt(encryptedMsg);

            // Verify
            assertThat(actualRisk).usingRecursiveComparison().isEqualTo(expectedRisk);
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
    }

    private static ComputedHidingRisk getComputedHidingRisk() {
        ComputedHidingRisk expectedRisk = new ComputedHidingRisk();
        expectedRisk.setToken("tok");
        expectedRisk.setDenyScore(1);
        expectedRisk.setVirtualMachineScore(2);
        expectedRisk.setAntiTrackerScore(3);
        expectedRisk.setHideDeviceScore(4);
        expectedRisk.setPrivateNavigationScore(5);
        expectedRisk.setHideRealIPScore(6);
        expectedRisk.setBadReputationIPScore(7);
        expectedRisk.setRootScore(8);
        return expectedRisk;
    }
}
