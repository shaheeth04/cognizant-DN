// src/BlogDetails.js
import React from 'react';

function BlogDetails(props) {
  return (
    <ul>
      {props.blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.description}</p>
        </div>
      ))}
    </ul>
  );
}

export default BlogDetails;