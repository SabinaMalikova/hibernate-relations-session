package peaksoft.service;

import peaksoft.dao.CourseDao;
import peaksoft.dao.daoImpl.CourseDaoImpl;

public class CourseServiceImpl implements CourseService{
    CourseDao courseDao = new CourseDaoImpl();
    @Override
    public int countStudentsFromCourse(Long courseId) {
        return courseDao.countStudentsFromCourse(courseId);

    }
}
