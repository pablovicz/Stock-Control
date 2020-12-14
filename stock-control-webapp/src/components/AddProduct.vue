<template>
  <div class="submitForm">
    <div v-if="!submitted">
      <div class="form-group">
        <label for="name">Name</label>
        <input
          type="text"
          class="form-control"
          id="name"
          required
          v-model="product.name"
          name="name"
        />
      </div>
      <div class="form-group">
        <label for="price">Price</label>
        <input
          type="number"
          class="form-control"
          id="price"
          required
          v-model="product.price"
          name="price"
        />
      </div>
      <div class="form-group">
        <label for="amount">Amount</label>
        <input
          type="number"
          class="form-control"
          id="amout"
          required
          v-model="product.amout"
          name="amount"
        />
      </div>
      <div class="form-group">
        <label for="barCode">Bar Code</label>
        <input
          type="number"
          class="form-control"
          id="barCode"
          required
          v-model="product.barCode"
          name="barCode"
        />
      </div>

      <button v-on:click="saveProduct" class="btn btn-sucess">Submit</button>
    </div>
    <div v-else>
      <h4>You submitted successfully!</h4>
      <button class="btn btn-success" v-on:click="newProduct">Add</button>
    </div>
  </div>
</template>

<script>
import http from "../http-common.js";

export default {
  name: "add-product",
  data() {
    return {
      product: {
        id: 0,
        name: "",
        price: 0,
        amount: 0,
        barCode: 0,
      },
      submitted: false,
    };
  },
  methods: {
    saveProduct() {
      var data = {
        name: this.product.name,
        price: this.product.price,
        amount: this.product.amount,
        barCode: this.product.barCode,
      };

      http
        .post("/product", data)
        .then((response) => {
          this.product.id = response.data.id;
          console.log(response.data);
        })
        .catch((e) => {
          console.log(e);
        });

      this.submitted = true;
    },
    newProduct() {
      this.submitted = false;
      this.product = {};
    },
  },
};
</script>

<style scoped>
.submitForm {
  max-width: 300px;
  margin: auto;
}
</style>