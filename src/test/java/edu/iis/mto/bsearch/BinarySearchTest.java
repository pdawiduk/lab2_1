package edu.iis.mto.bsearch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Shogun on 2016-04-03.
 */
public class BinarySearchTest {

    int[] seq = {0,1,2,3,4,5,6};

    @Test
    public void search() throws Exception {

        Assert.assertEquals("( elem at position 2)",BinarySearch.search(1,seq));
    }

}