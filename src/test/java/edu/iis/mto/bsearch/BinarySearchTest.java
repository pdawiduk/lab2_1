package edu.iis.mto.bsearch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Shogun on 2016-04-03.
 */
public class BinarySearchTest {

    int[] seq1 ={2};
    int[] seq2 = {0,1,2,3,4,5,6};

    @Test
    public final void testSearch() throws Exception {
        Assert.assertThat("( elem at position 1)",is(BinarySearch.search(2,seq1).toString()));
        Assert.assertThat("elem not found",is(BinarySearch.search(1,seq1).toString()));
        Assert.assertThat("( elem at position 1)",is(BinarySearch.search(0,seq2).toString()));
        Assert.assertThat("( elem at position "+seq2.length+")",is(BinarySearch.search(6,seq2).toString()));
        Assert.assertThat("( elem at position 4)",is(BinarySearch.search(3,seq2).toString()));
        Assert.assertThat("elem not found",is(BinarySearch.search(32,seq2).toString()));
    }

}