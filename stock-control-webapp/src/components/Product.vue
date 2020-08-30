<template>
  <div v-if="this.product">
    <h4>Customer</h4>
    <div>
      <label>Name:</label>
      {{this.product.name}}
    </div>
    <div>
      <label>Price: U$</label>
      {{this.product.price}}
    </div>
    <div>
      <label>Amount:</label>
      {{this.product.Amount}}
    </div>
    <div>
      <label>Bar Code:</label>
      {{this.product.barCode}}
    </div>

    <span class="button is-small btn-danger" @click="deleteProduct()">Delete</span>
  </div>
  <div v-else>
    <br />
    <p>Please click on a Product...</p>
  </div>
</template>

<script>
import htpp from "../http-common.js";

export default {
  name: "product",
  props: ["product"],
  methods: {
    deleteProduct() {
      http
        .delete("/product/" + this.product.id)
        .then((response) => {
          console.log(response.data);
          this.$emit("refreshData");
          this.$router.push("/");
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },
};
</script>