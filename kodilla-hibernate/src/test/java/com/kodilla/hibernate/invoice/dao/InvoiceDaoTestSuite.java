package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        List <Item> items = new ArrayList <>();

        Product dellPC = new Product("DellPC");
        Product lenovoPC = new Product("LenovoPC");
        Product hpPC = new Product("HPPC");

        Item item1 = new Item(dellPC, new BigDecimal(10), 1, new BigDecimal(10));
        Item item2 = new Item(lenovoPC, new BigDecimal(10), 1, new BigDecimal(10));
        Item item3 = new Item(hpPC, new BigDecimal(10), 1, new BigDecimal(10));

        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice = new Invoice("1234/2019", items);

        //When

        invoiceDao.save(invoice);
        productDao.save(dellPC);
        productDao.save(lenovoPC);
        productDao.save(hpPC);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int invoiceId = invoice.getId();

        //Then

        Assert.assertNotEquals(0, invoiceId);
    }
}
