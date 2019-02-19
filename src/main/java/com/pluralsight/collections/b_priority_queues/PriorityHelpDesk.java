package com.pluralsight.collections.b_priority_queues;

import com.pluralsight.collections.Category;
import com.pluralsight.collections.Customer;
import com.pluralsight.collections.Enquiry;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityHelpDesk
{
    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>()
    {
        public int compare(final Enquiry o1, final Enquiry o2)
        {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };

    private Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public void enquire(final Customer customer, final Category type)
    {
        enquiries.offer(new Enquiry(customer, type));
    }

    public void processAllEnquires()
    {
        Enquiry enquiry;
        while ((enquiry = enquiries.poll()) != null)
        {
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args)
    {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARY, Category.COMPUTER);

        helpDesk.processAllEnquires();
    }
}
