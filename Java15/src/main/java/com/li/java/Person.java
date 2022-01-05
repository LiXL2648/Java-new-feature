package com.li.java;

sealed public class Person permits Student, Teacher, Worker {}

final class Teacher extends Person {}

sealed class Student extends Person permits MiddleSchoolStudent, undergraduate {}

final class MiddleSchoolStudent extends Student {}

final class undergraduate extends Student {}

non-sealed class Worker extends Person {}

class Doctor extends Worker {}