// src/App.js
import React from 'react';
import './App.css';
import CourseDetails from './CourseDetails';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';

export const books = [
  { id: 101, bname: 'Master React', price: 670 },
  { id: 102, bname: 'Deep Dive into Angular 11 ', price: 800 },
  { id: 103, bname: 'Mongo Essentials', price: 450 }
];

const courses = [
  { id: 201, cname: 'Angular', date: '4/5/2021' },
  { id: 202, cname: 'React', date: '6/3/20201' } 
];

const blogs = [
  { id: 301, title: 'React Learning', author: 'Stephen Biz', description: 'Welcome to learning React!' },
  { id: 302, title: 'Installation', author: 'Schewzdenier', description: 'You can install React from npm.' }
];

function App() {
  let content = null;
  if (blogs && blogs.length > 0) {
    content = <BlogDetails blogs={blogs} />;
  }

  const showCourses = true;
  const coursedet = showCourses && <CourseDetails courses={courses} />;

  return (
    <div className="container">
      
      <div className="mystyle1">
        <h1>Course Details</h1>
        {coursedet}
      </div>

      <div className="st2">
        <h1>Book Details</h1>
        <BookDetails books={books} />
      </div>

      <div className="v1">
        <h1>Blog Details</h1>
        {content}
      </div>

    </div>
  );
}

export default App;