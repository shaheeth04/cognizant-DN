import React, { Component } from "react";

class Register extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: "",
      email: "",
      password: "",
      errors: {
        name: "",
        email: "",
        password: "",
      },
    };

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    const { name, value } = event.target;
    this.setState({ [name]: value }, () => {
      this.validateField(name, value);
    });
  }

  validateField(fieldName, value) {
    let fieldValidationErrors = this.state.errors;

    switch (fieldName) {
      case "name":
        fieldValidationErrors.name =
          value.length < 5 ? "Name must be at least 5 characters long." : "";
        break;
      case "email":
        fieldValidationErrors.email =
          value.includes("@") && value.includes(".")
            ? ""
            : 'Email must contain "@" and "." characters.';
        break;
      case "password":
        fieldValidationErrors.password =
          value.length < 8
            ? "Password must be at least 8 characters long."
            : "";
        break;
      default:
        break;
    }

    this.setState({ errors: fieldValidationErrors });
  }

  
  handleSubmit(event) {
    event.preventDefault(); 

    const { name, email, password, errors } = this.state;

    
    if (
      name.length >= 5 &&
      email.includes("@") &&
      email.includes(".") &&
      password.length >= 8
    ) {
      alert("Registration Successful!\nWelcome " + name);
    } else {
      alert("Please fix validation errors before submitting.");
    }
  }

  render() {
    return (
      <div
        style={{
          maxWidth: "400px",
          margin: "50px auto",
          fontFamily: "sans-serif",
          padding: "20px",
          border: "1px solid #ccc",
          borderRadius: "5px",
        }}
      >
        <h2>Register Here</h2>
        <form onSubmit={this.handleSubmit}>
          <div style={{ marginBottom: "15px" }}>
            <label style={{ display: "block", marginBottom: "5px" }}>
              Name:
            </label>
            <input
              type="text"
              name="name"
              value={this.state.name}
              onChange={this.handleChange}
              style={{ width: "100%", padding: "8px", boxSizing: "border-box" }}
              required
            />
            {this.state.errors.name && (
              <small style={{ color: "red" }}>{this.state.errors.name}</small>
            )}
          </div>

          {/* Email Input field */}
          <div style={{ marginBottom: "15px" }}>
            <label style={{ display: "block", marginBottom: "5px" }}>
              Email:
            </label>
            <input
              type="text"
              name="email"
              value={this.state.email}
              onChange={this.handleChange}
              style={{ width: "100%", padding: "8px", boxSizing: "border-box" }}
              required
            />
            {this.state.errors.email && (
              <small style={{ color: "red" }}>{this.state.errors.email}</small>
            )}
          </div>


          <div style={{ marginBottom: "15px" }}>
            <label style={{ display: "block", marginBottom: "5px" }}>
              Password:
            </label>
            <input
              type="password"
              name="password"
              value={this.state.password}
              onChange={this.handleChange}
              style={{ width: "100%", padding: "8px", boxSizing: "border-box" }}
              required
            />
            {this.state.errors.password && (
              <small style={{ color: "red" }}>
                {this.state.errors.password}
              </small>
            )}
          </div>

          <button
            type="submit"
            style={{
              padding: "10px 15px",
              background: "#007BFF",
              color: "#fff",
              border: "none",
              borderRadius: "3px",
              cursor: "pointer",
            }}
          >
            Submit
          </button>
        </form>
      </div>
    );
  }
}

export default Register;
