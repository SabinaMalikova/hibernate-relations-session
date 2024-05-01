package peaksoft;

import peaksoft.config.HibernateConfig;
import peaksoft.service.CourseService;
import peaksoft.service.CourseServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CourseService courseService = new CourseServiceImpl();

        System.out.println(courseService.countStudentsFromCourse(1L));
    }
}
