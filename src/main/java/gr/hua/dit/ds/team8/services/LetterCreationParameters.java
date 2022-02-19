package gr.hua.dit.ds.team8.services;

import org.springframework.util.Assert;

public class LetterCreationParameters {
        private final String student_fn;
        private final String student_ln;
        private final String teacher_fn;
        private final String teacher_ln;
        private final String email;

        public LetterCreationParameters(String student_fn,
                                        String student_ln,
                                        String teacher_fn,
                                        String teacher_ln,
                                        String email) {
           // Assert.notNull(teacher_fn, "givenName should not be null");
           // Assert.notNull(teacher_ln, "familyName should not be null");
           // Assert.notNull(teacher_ln, "familyName should not be null");
           // Assert.notNull(teacher_ln, "familyName should not be null");
          //  Assert.notNull(teacher_ln, "familyName should not be null");
            this.student_fn = student_fn;
            this.student_ln = student_ln;
            this.teacher_fn = teacher_fn;
            this.teacher_ln =teacher_ln;
            this.email = email;
        }

        public String getStudent_fn() {
            return student_fn;
        }
        public String getStudent_ln() {
            return student_ln;
          }
        public String getTeacher_fn() {
            return teacher_fn;
        }
        public String getTeacher_ln() {
             return teacher_ln;
        }
        public String getEmail() {
            return email;
         }
    }



