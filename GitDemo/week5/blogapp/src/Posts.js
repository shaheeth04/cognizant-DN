import React, { Component } from 'react';
import './Posts.css'; // Importing the separate stylesheet

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
    
    this.loadPosts = this.loadPosts.bind(this);
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(function(response) {
        return response.json();
      })
      .then(function(data) {
        this.setState({ posts: data });
      }.bind(this))
      .catch(function(error) {
        console.log('Error fetching posts:', error);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('An error occurred in the component: ' + error);
  }

  render() {
    return (
      <div className="blog-container">
        <h1 className="blog-title">Blog Posts</h1>
        
        {this.state.posts.map(function(post) {
          return (
            <div key={post.id} className="post-card">
              <h2 className="post-heading">{post.title}</h2>
              <p className="post-body">{post.body}</p>
            </div>
          );
        })}
      </div>
    );
  }
}

export default Posts;