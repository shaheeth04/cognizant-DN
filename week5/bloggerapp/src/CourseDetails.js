// src/CourseDetails.js
import React from 'react';

function CourseDetails(props) {
  if (!props.courses) {
    return null;
  }

  return (
    <ul>
      {props.courses.map((course) => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </ul>
  );
}

export default CourseDetails;