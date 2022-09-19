package com.example.examinationsystem.store;

import com.example.examinationsystem.model.CourseRequest;
import com.example.examinationsystem.model.QuestionRequest;
import com.example.examinationsystem.model.StudentRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Database {
    private final static HashMap<Integer, StudentRequest> studentHashMap= new HashMap<>();
    private final static HashMap<Integer , QuestionRequest> questionHashMap= new HashMap<>();
    private final static  HashMap<Integer, CourseRequest> courseHashMap= new HashMap<>();
    public static void saveStudent(StudentRequest payload){
        if(payload.getId() !=null && studentHashMap.containsKey(payload.getId())){
            studentHashMap.put(payload.getId(), payload);
        }else{
            Integer studentId = studentHashMap.size()+1;
            payload.setId(studentId);
            payload.setDateCreated(LocalDateTime.now());
            studentHashMap.put(studentId, payload);
        }
    }
    public static Optional<StudentRequest> findStudent(Integer studentId){
        if(studentHashMap.containsKey(studentId))
           return  Optional.of(studentHashMap.get(studentId));
        else
            return Optional.empty();

    }
    public static String removeStudent(Integer studentId){
        if(studentHashMap.containsKey(studentId)){
            studentHashMap.remove(studentId);
            return "Student removed successfully";
        }
        else
            return "Student not found";
    }
    public static List<StudentRequest> listStudent(){
        List<StudentRequest> ls = new ArrayList<>();
        ls.addAll(studentHashMap.values());
        return ls;
    }

//    Questions
    public static void addQuestion(QuestionRequest payload){
        if (payload.getQuestionId() == null || !questionHashMap.containsKey(payload.getQuestionId())) {
            Integer questionId = questionHashMap.size() + 1;
            payload.setQuestionId(questionId);
            payload.setDateCreated(LocalDateTime.now());
        }
        questionHashMap.put(payload.getQuestionId(), payload);

    }

    public static List<QuestionRequest> listQuestion(){
        List<QuestionRequest> ls =new ArrayList<>();
        ls.addAll(questionHashMap.values());
        return ls;
    }

    public static String removeQuestion(Integer questionId){
        if(questionHashMap.containsKey(questionId)){
            questionHashMap.remove(questionId);
            return "Student removed successfully";
        }
        else
            return "Student not found";
    }

    public static Optional<QuestionRequest> findQuestion(Integer questionId){
        if(questionHashMap.containsKey(questionId))
            return  Optional.of(questionHashMap.get(questionId));
        else
            return Optional.empty();

    }


//    Course
    public  static  void addCourse(CourseRequest payload){
        if (payload.getCourseId() !=null && courseHashMap.containsKey(payload.getCourseId())){
            courseHashMap.put(payload.getCourseId(), payload);
        }else{
            Integer courseId = courseHashMap.size()+1;
            payload.setCourseId(courseId);
            payload.setDateCreated(LocalDateTime.now());
            courseHashMap.put(courseId, payload);
        }

    }

    public static String removeCourse(Integer courseId){
        if(studentHashMap.containsKey(courseId)){
            studentHashMap.remove(courseId);
            return "Course removed successfully";
        }
        else
            return "Course not found";
    }



    
}
