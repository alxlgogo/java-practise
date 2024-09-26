package com.wenjing.wd;

import java.util.List;

public class Test {

    @org.junit.Test
    public void findDuplicateElements() {
        int[] nums2 = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3};
        List<Integer> duplicateElements = Main.findDuplicateElements(nums2);
//        Assert.assertEquals(duplicateElements, Arrays.asList(2,3));
    }
}
